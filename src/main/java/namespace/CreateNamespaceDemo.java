/**
 * Copyright (C), 2015-2019, 私人无限公司
 * FileName: CreateNamespace
 * Author: 1
 * Date: 2019/10/24 9:10
 * Description: 名称空间api
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
package namespace;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.NamespaceDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * 名称空间api
 * @author 1
 * @create 2019/10/24
 * @since 1.0.0
 */
public class CreateNamespaceDemo {
    private HBaseAdmin hBaseAdmin;
    //private static Logger logger=Logger.getLogger();
    public static void main(String[] args) {
        //1.获取连接的配置对象
        Configuration conf= new Configuration();
        //2.需要设置zookeeper
        conf.set("hbase.zookeeper.quorum","hadoop001,hadoop002,hadoop003");
        //3、获取一个hbase的客户端对象
        HBaseAdmin hBaseAdmin= null;
//        try {
//            hBaseAdmin = new HBaseAdmin(conf);
//            //4.创建名称空间的描述器对象
//            NamespaceDescriptor nsd =new NamespaceDescriptor();
//            hBaseAdmin.createNamespace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {

        }
    }

