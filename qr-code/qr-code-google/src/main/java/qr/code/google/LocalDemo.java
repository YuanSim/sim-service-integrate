package qr.code.google;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.util.ResourceUtils;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.file.Paths;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/3/6
 */
public class LocalDemo {

    public static void main(String[] args) throws WriterException, IOException {

//        File file = new File(this.getClass().getResource("").getPath());
/*
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator;

        String img_name = "jfq.png";
        //创建二维码对象
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        //生成二维码
        BitMatrix bitMatrix =
                qrCodeWriter.encode("http://organizationtest.jf-pay.com", BarcodeFormat.QR_CODE,30,30);


        OutputStream os = new FileOutputStream(path);
        MatrixToImageWriter.writeToStream(bitMatrix, "png", os);*/

    }
}































