package com.jfz.improve.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;


@Configuration
@Slf4j
public class ElasticsearchConfig {
    @Value("localhost")
    private String host;
    @Value("9200")
    private int port;
    @Value("localhost")
    private String hosts;
    @Value("elastic")
    private String username;
    @Value("Iho+G8jVuEjYKzJUPxsY")
    private String password;


    /**
     * 单节点没密码连接
     *
     * @return
     */
    @Bean
    public ElasticsearchClient client() {
        ElasticsearchTransport transport = null;
        // 不是集群时
        if (hosts.split(",").length == 1) {
            // 无账号、密码
            if (StringUtils.isEmpty(username) && StringUtils.isEmpty(password)) {
                RestClient client = RestClient.builder(new HttpHost(host, port, "http")).build();
                transport = new RestClientTransport(client, new JacksonJsonpMapper());
            } else {
                // 账号密码的配置
                final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
                credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
                // 自签证书的设置，并且还包含了账号密码
                RestClientBuilder.HttpClientConfigCallback callback = httpAsyncClientBuilder -> httpAsyncClientBuilder
//                        .setSSLContext(buildSSLContext())
                        .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                        .setDefaultCredentialsProvider(credentialsProvider)
                       ;

                RestClient client = RestClient.builder(new HttpHost(host, port, "http"))
                        .setHttpClientConfigCallback(callback)
                        .build();
                transport = new RestClientTransport(client, new JacksonJsonpMapper());
            }
        }
        return new ElasticsearchClient(transport);
    }

//    /**
//     * 多接点账号密码连接
//     *
//     * @return
//     */
//    @Bean
//    public ElasticsearchClient clientByPwd() {
//        ElasticsearchTransport transport = null;
//        // 不是集群时
//        if (hosts.split(",").length == 1) {
//            // 无账号、密码
//            if (StringUtils.isEmpty(username) && StringUtils.isEmpty(password)) {
//                RestClient client = RestClient.builder(new HttpHost(host, port, "http")).build();
//                transport = new RestClientTransport(client, new JacksonJsonpMapper());
//            } else {
//                // 账号密码的配置
//                final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//                credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
//                // 自签证书的设置，并且还包含了账号密码
//                RestClientBuilder.HttpClientConfigCallback callback = httpAsyncClientBuilder -> httpAsyncClientBuilder
//                        .setSSLContext(buildSSLContext())
//                        .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                        .setDefaultCredentialsProvider(credentialsProvider)
//                        .setDefaultHeaders(
//                                Stream.of(new BasicHeader(
//                                        HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString())).collect(toList())
//                        ).addInterceptorLast(
//                                (HttpResponseInterceptor)
//                                        (response, context) ->
//                                                response.addHeader("X-Elastic-Product", "Elasticsearch"));
//
//                RestClient client = RestClient.builder(new HttpHost(host, port, "http"))
//                        .setHttpClientConfigCallback(callback)
//                        .build();
//                transport = new RestClientTransport(client, new JacksonJsonpMapper());
//            }
//        } else {
//            // 无账号、密码
//            if (StringUtils.isEmpty(username) && StringUtils.isEmpty(password)) {
//                transport = getElasticsearchTransport(toHttpHost());
//            } else {
//                transport = getElasticsearchTransport(username, password, toHttpHost());
//            }
//        }
//        return new ElasticsearchClient(transport);
//    }
//
////    /**
////     * ESes自签证书连接
////     *
////     * @return
////     */
////    @Bean
////    public ElasticsearchClient clientByApiKey() {
////        ElasticsearchTransport transport = null;
////        if (!StringUtils.isEmpty(apikey)) {
////            transport = getElasticsearchTransport(apikey, toHttpHost());
////        }
////        return new ElasticsearchClient(transport);
////    }
//
//
//    private HttpHost[] toHttpHost() {
//        if (!StringUtils.hasLength(hosts)) {
//            throw new RuntimeException("invalid elasticsearch configuration");
//        }
//        String[] hostArray = hosts.split(",");
//        HttpHost[] httpHosts = new HttpHost[hostArray.length];
//        HttpHost httpHost;
//        for (int i = 0; i < hostArray.length; i++) {
//            String[] strings = hostArray[i].split(":");
//            httpHost = new HttpHost(strings[0], Integer.parseInt(strings[1]), "http");
//            httpHosts[i] = httpHost;
//        }
//        return httpHosts;
//    }
//
//    private static ElasticsearchTransport getElasticsearchTransport(String username, String password, HttpHost... hosts) {
//        // 账号密码的配置
//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
//
//        // 自签证书的设置，并且还包含了账号密码
//        RestClientBuilder.HttpClientConfigCallback callback = httpAsyncClientBuilder -> httpAsyncClientBuilder
//                .setSSLContext(buildSSLContext())
//                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                .setDefaultCredentialsProvider(credentialsProvider)
//                .setDefaultHeaders(
//                        Stream.of(new BasicHeader(
//                                HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString())).collect(toList())
//                ).addInterceptorLast(
//                        (HttpResponseInterceptor)
//                                (response, context) ->
//                                        response.addHeader("X-Elastic-Product", "Elasticsearch"))
//                .addInterceptorLast((HttpResponseInterceptor) (response, context)
//                        -> response.addHeader("X-Elastic-Product", "Elasticsearch"));
//        // 用builder创建RestClient对象
//        RestClient client = RestClient
//                .builder(hosts)
//                .setHttpClientConfigCallback(callback)
//                .build();
//
//        return new RestClientTransport(client, new JacksonJsonpMapper());
//    }
//
//    private static ElasticsearchTransport getElasticsearchTransport(HttpHost... hosts) {
//        // 用builder创建RestClient对象
//        RestClient client = RestClient
//                .builder(hosts)
//                .build();
//
//        return new RestClientTransport(client, new JacksonJsonpMapper());
//    }
//
//    private static SSLContext buildSSLContext() {
//        ClassPathResource resource = new ClassPathResource("es01.crt");
//        SSLContext sslContext = null;
//        try {
//            CertificateFactory factory = CertificateFactory.getInstance("X.509");
//            Certificate trustedCa;
//            try (InputStream is = resource.getInputStream()) {
//                trustedCa = factory.generateCertificate(is);
//            }
//            KeyStore trustStore = KeyStore.getInstance("pkcs12");
//            trustStore.load(null, null);
//            trustStore.setCertificateEntry("ca", trustedCa);
//            SSLContextBuilder sslContextBuilder = SSLContexts.custom().loadTrustMaterial(trustStore, null);
//            sslContext = sslContextBuilder.build();
//        } catch (CertificateException | IOException | KeyStoreException | NoSuchAlgorithmException |
//                 KeyManagementException e) {
//            log.error("ES连接认证失败", e);
//        }
//        return sslContext;
//    }
//
//    private static ElasticsearchTransport getElasticsearchTransport(String apiKey, HttpHost... hosts) {
//        // 将ApiKey放入header中
//        Header[] headers = new Header[]{new BasicHeader("Authorization", "ApiKey " + apiKey)};
//
//        // es自签证书的设置
//        RestClientBuilder.HttpClientConfigCallback callback = httpAsyncClientBuilder -> httpAsyncClientBuilder
//                .setSSLContext(buildSSLContext())
//                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                .setDefaultHeaders(
//                        Stream.of(new BasicHeader(
//                                HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString())).collect(toList())
//                ).addInterceptorLast(
//                        (HttpResponseInterceptor)
//                                (response, context) ->
//                                        response.addHeader("X-Elastic-Product", "Elasticsearch"));
//        // 用builder创建RestClient对象
//        RestClient client = RestClient
//                .builder(hosts)
//                .setHttpClientConfigCallback(callback)
//                .setDefaultHeaders(headers)
//                .build();
//
//        return new RestClientTransport(client, new JacksonJsonpMapper());
//    }
}
