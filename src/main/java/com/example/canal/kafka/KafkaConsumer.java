//package com.example.canal.kafka;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.annotation.PartitionOffset;
//import org.springframework.kafka.annotation.TopicPartition;
//import org.springframework.stereotype.Component;
//
///**
// * @author hongjiangming
// * @date 2022/2/11 4:12 下午
// * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
// */
//@Component
//public class KafkaConsumer {
//
//    /**
//     * @Title 指定topic、partition、offset消费
//     * @Description 同时监听canal和topic2，监听topic1的0号分区、topic2的 "0号和1号" 分区，指向1号分区的offset初始值为8开始的
//     * @Author long.yuan
//     * @Date 2020/3/22 13:38
//     * @Param [record]
//     * @return void
//     **/
//    @KafkaListener(id = "consumer1",groupId = "felix-group",topicPartitions = {
//            @TopicPartition(topic = "canal", partitions = { "0" }),
//            @TopicPartition(topic = "topic2", partitions = "0", partitionOffsets = @PartitionOffset(partition = "1",
//                    initialOffset = "8"))
//    })
//    public void onMessage2(ConsumerRecord<?, ?> record) {
//        System.out.println("topic:" + record.topic() + "|partition:" + record.partition() + "|offset:" + record.offset() + "|value:" + record.value());
//    }
//
//
//    // 消费监听
//    @KafkaListener(topics = {"canal"})
//    public void onMessage(ConsumerRecord<?, ?> record) {
//        // 消费的哪个topic、partition的消息,打印出消息内容
//        System.out.println("简单消费：" + record.topic() + "-" + record.partition() + "-" + record.value());
//    }
//}
