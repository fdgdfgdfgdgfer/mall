package com.jfz.improve.cotroller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.*;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import com.alibaba.fastjson.JSON;
import com.jfz.improve.aspect.ELK;
import com.jfz.improve.model.DocumentPartESDto;
import com.jfz.improve.service.DocumentDemoService;
import com.jfz.improve.service.IndexService;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;

/**
 * @Author jfz
 * @Date 2024/4/18 9:53
 * @PackageName:com.example.eslastic.cotroller
 * @ClassName: IndexController
 */
@RestController
@RequestMapping("/elasticTest")
public class IndexController {

    @Autowired
    private DocumentDemoService documentDemoService;
    @Autowired
    private IndexService indexService;
    @Autowired
    private ElasticsearchClient inx;

    @GetMapping("/test")
    @ELK
    public Integer create() throws Exception {
        throw new Exception("sssss");
    }

    @GetMapping("/aaa")
    @ELK
    public void te() {
        System.out.println("aaa");
    }

    @GetMapping("getLog")
    public Set<String> getLog() throws IOException {
        Set<String> allIndex = indexService.getAllIndex();
        return allIndex;
    }

    @GetMapping("getIndex")
    public void getIndex() throws IOException {
        Map<String, IndexState> mall = inx.indices().get(req -> req.index("mall")).result();
        System.out.println("获取索引");
        System.out.println(mall);
        System.out.println("获取全部索引");
        Set<String> set = inx.indices().get(req -> req.index("*")).result().keySet();
        System.out.println(set);
        System.out.println("删除索引");
        boolean mall1 = inx.indices().delete(req -> req.index("mall")).acknowledged();
        System.out.println(mall1 ? "删除" : "失败");
    }

    @GetMapping("/docment")
    public void getDocment() throws IOException {
        DocumentPartESDto documentPartESDto = new DocumentPartESDto(
                "product",
                "pro",
                "kid",
                "good job",
                "type"
        );
        IndexRequest<Object> of = IndexRequest.of(i ->
                i.index("product")
                        .id("pro")
                        .document(documentPartESDto)
        );
        IndexResponse index = inx.index(of);
        System.out.println(index);
        System.out.println(index.version());
    }

    @GetMapping("/docmentJson")
    public void docmentJson() throws IOException {
        DocumentPartESDto documentPartESDto = new DocumentPartESDto(
                "product22",
                "pro22",
                "kid",
                "good job two",
                "type"
        );
        String string = JSON.toJSONString(documentPartESDto);
        IndexRequest<Object> of = IndexRequest.of(i ->
                i.index("product")
                        .id("pro")
                        .withJson(new StringReader(string))
        );
        IndexResponse index = inx.index(of);
        System.out.println(index.seqNo());
        System.out.println(index.index());
        System.out.println(index.id());
    }


    @GetMapping("moreDocment")
    public void moreDocment() throws IOException {
        List<DocumentPartESDto> documentPartESDtos = Arrays.asList(new DocumentPartESDto(
                        "1",
                        "pro22",
                        "kid",
                        "good job two",
                        "type"
                ),
                new DocumentPartESDto(
                        "2",
                        "pro22",
                        "kid",
                        "good job two",
                        "type"
                ),
                new DocumentPartESDto(
                        "3",
                        "pro22",
                        "kid",
                        "good job two",
                        "type"
                ),
                new DocumentPartESDto(
                        "4",
                        "pro22",
                        "kid",
                        "good job two",
                        "type"
                )
        );

        BulkRequest.Builder builder = new BulkRequest.Builder();
        for (DocumentPartESDto documentPartESDto : documentPartESDtos) {
            builder.operations(
                    req ->req.index(inx ->
                            inx.index("product")
                                    .id(documentPartESDto.getId())
                                    .document(documentPartESDto)
                            )

                );
        }
        BulkResponse bulk = inx.bulk(builder.build());
        for (BulkResponseItem bk :bulk.items()){
            System.out.println(bk.id());
            System.out.println(bk.result());
        }
    }

    @GetMapping("/getDocment")
    public void getDocments() throws IOException {
//        GetResponse<ObjectNode> response = inx.get(g -> g
//            .index("products")
//            .id("bk-1"),
//            ObjectNode.class
//        );
        GetResponse<ObjectNode> product = inx.get(req ->
                        req.index("product")
                                .id("1"),
                ObjectNode.class
        );
        System.out.println(product.found());

    }
}
