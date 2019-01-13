package co.bxvip.tools;
public class ImageLoader {
    /**
     * 加载图片 返回 bitmap 数据再处理
     */
    public static void loadGlideTarget(android.content.Context context, String url, com.bumptech.glide.request.target.SimpleTarget target) {
        com.bumptech.glide.Glide.with(context)
                .load(url)
                .into(target);
    }
}
