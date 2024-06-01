public class VideoConverter {
    public VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("\n======= VideoConversion: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(file);
        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, file.getName(), codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, file.getAudioBuffer());
        System.out.println("====== VideoConversion: conversion completed =======\n");
        return videoFileConverted;
    }
}
