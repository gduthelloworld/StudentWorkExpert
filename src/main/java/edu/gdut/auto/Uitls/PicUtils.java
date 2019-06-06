package edu.gdut.auto.Uitls;

/**
 * 图片类工具
 */
public class PicUtils {
    /**
     * 判断是否为图片
     * @param fileName
     * @return
     */
    public static boolean isPic(String fileName){
        String fileType=getSuffixName(fileName);
        String[] picType = {"jpg", "png", "jpeg"};
        for (int i = 0; i < picType.length; i++) {
            if (picType[i].equals(fileType.toLowerCase()))
                return true;
        }
        return false;
    }
    public static String getSuffixName(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }
}
