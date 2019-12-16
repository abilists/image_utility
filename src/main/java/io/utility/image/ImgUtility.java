package io.utility.image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class ImgUtility {

	private static final int IMG_WIDTH = 96;
	private static final int IMG_HEIGHT = 96;

    public static BufferedImage resizeImage(BufferedImage originalImage, int type){
    	return resizeImage(originalImage, type, IMG_WIDTH, IMG_HEIGHT);
    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int type, int width, int height){
    	
		BufferedImage resizedImage = new BufferedImage(width, height, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, width, height, null);
		g.dispose();

		return resizedImage;
    }

    public static BufferedImage resizeImage64(String pngimageData) throws IOException {
    	return resizeImage64(pngimageData, IMG_WIDTH, IMG_HEIGHT);
    }

    public static BufferedImage resizeImage64(String pngimageData, int width, int height) throws IOException {
		String base64Img = pngimageData.toString().split(",")[1];
		byte[] imgBytesAsString = Base64.getDecoder().decode(base64Img.getBytes());

		BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(imgBytesAsString));

		// Image type
		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

		return ImgUtility.resizeImage(originalImage, type, width, height);
    }

}