public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        Codec mpeg4CompressionCodec = new MPEG4CompressionCodec();

        videoFile.play(mpeg4CompressionCodec); // програємо файл не правильним кодеком
//        videoFile.play(new OggCompressionCodec());   // програємо файл правильним кодеком
        // оскільки у клієнта доступний лише кодек "mp4" потрібно провести
        // конвертацію "youtubevideo.ogg" з формату "ogg" у формат "mp4"

        VideoConverter converter = new VideoConverter();
        VideoFile videoFileConverted = converter.convert(videoFile, mpeg4CompressionCodec);

        videoFileConverted.play(mpeg4CompressionCodec);
    }
}
