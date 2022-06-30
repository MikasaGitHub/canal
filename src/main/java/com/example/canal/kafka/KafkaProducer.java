//package com.example.canal.kafka;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.util.concurrent.ListenableFutureCallback;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author hongjiangming
// * @date 2022/2/11 4:08 下午
// * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
// */
//@RestController
//public class KafkaProducer {
//
//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//    @RequestMapping("/normal")
//    public String sendMessage() {
//        kafkaTemplate.send("canal", "test message");
//        String success = "success";
//        return success;
//    }
//
//    @RequestMapping("/callBack")
//    public void callBack() {
//        kafkaTemplate.send("canal", "test callBack").addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
//            @Override
//            public void onFailure(Throwable ex) {
//                System.out.println("发送消息失败："+ex.getMessage());
//            }
//
//            @Override
//            public void onSuccess(SendResult<String, Object> result) {
//                System.out.println("发送消息成功：" + result.getRecordMetadata().topic() + "-"
//                        + result.getRecordMetadata().partition() + "-" + result.getRecordMetadata().offset());
//            }
//        });
//    }
//
//
//    @GetMapping("/kafka/transaction")
//    public void sendMessage7(){
//        // 声明事务：后面报错消息不会发出去
//        // kafkaTemplate.executeInTransaction(operations -> {
//        //    operations.send("canal","test executeInTransaction");
//        //    throw new RuntimeException("fail");
//        //});
//        // 不声明事务：后面报错但前面消息已经发送成功了
//        kafkaTemplate.send("canal","test executeInTransaction");
//        throw new RuntimeException("fail");
//    }
//}
