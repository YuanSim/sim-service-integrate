package qr.code.google;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.util.ResourceUtils;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/3/6
 */
public class LocalDemo {

    /**
     *
     */
    private static final String DATE_FORMAT = "yyyyMMddHHmmssSSSS";

    /**
     *
     */
    private static final DateFormat DF = new SimpleDateFormat(DATE_FORMAT);

    /**
     *
     */
    private static final NumberFormat NF = NumberFormat.getIntegerInstance();

    /**
     *
     */
    private static final int TIMESTAMP_LENGTH = 18;

    /**
     *
     */
    private static final int DEFAULT_LENGTH = 21;

    /**
     *
     */
    private static final int MIN_LENGTH = 20;

    private static int length = 0;

    public static void main(String[] args) {


        System.out.println(nextCode("sad"));
    }


    public static String nextCode() {
        Calendar calendar = Calendar.getInstance();
        long seed = calendar.getTimeInMillis();
        Random random = new Random(seed);
        if (length < MIN_LENGTH) {
            length = DEFAULT_LENGTH;
        }

        int randomLength = length - TIMESTAMP_LENGTH;
        int max = (int) Math.pow(10, randomLength) - 1;
        NF.setMaximumIntegerDigits(randomLength);
        NF.setMinimumIntegerDigits(randomLength);
        return DF.format(calendar.getTime()) + NF.format(random.nextInt(max));
    }

    public static String nextCode(String prefix) {
        return (prefix == null ? "" : prefix) + nextCode();
    }
}































