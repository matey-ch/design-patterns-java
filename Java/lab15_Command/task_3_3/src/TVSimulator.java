public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();
        Device radio = new Radio();

        RemoteController controllerTv = new RemoteController();
        RemoteController controllerRadio = new RemoteController();
        UniversalController universalController = new UniversalController();

        Command tvOn = new OnCommand(tv);
        Command tvOff = new OffCommand(tv);
        Command tvUp = new VolumeUpCommand(tv);
        Command tvDown = new VolumeDownCommand(tv);
        Command tvNext = new NextChannelCommand(tv);
        Command tvPrev = new PreviousChannelCommand(tv);

        Command radioOn = new OnCommand(radio);
        Command radioOff = new OffCommand(radio);
        Command radioUp = new VolumeUpCommand(radio);
        Command radioDown = new VolumeDownCommand(radio);
        Command radioNext = new NextChannelCommand(radio);
        Command radioPrev = new PreviousChannelCommand(radio);

        controllerTv.setCommandOn(tvOn);
        controllerTv.setCommandOff(tvOff);
        controllerTv.setCommandUp(tvUp);
        controllerTv.setCommandDown(tvDown);
        controllerTv.setCommandNext(tvNext);
        controllerTv.setCommandPrev(tvPrev);


        controllerRadio.setCommandOn(radioOn);
        controllerRadio.setCommandOff(radioOff);
        controllerRadio.setCommandUp(radioUp);
        controllerRadio.setCommandDown(radioDown);
        controllerRadio.setCommandNext(radioNext);
        controllerRadio.setCommandPrev(radioPrev);


        universalController.addCommandOff(tvOff);
        universalController.addCommandOff(radioOff);

        controllerTv.deviceOn();

        for (int i = 0; i < 30; i++) {
            controllerTv.deviceNextChanel();
        }
        controllerTv.deviceVolumeUp();

        controllerTv.deviceVolumeUp();
        controllerTv.deviceVolumeUp();

        controllerTv.devicePrevChanel();

        controllerTv.deviceVolumeDown();

        controllerTv.deviceOff();



        controllerRadio.deviceOn();

        for (int i = 0; i < 30; i++) {
            controllerRadio.deviceNextChanel();
        }
        controllerRadio.deviceVolumeUp();

        controllerRadio.deviceVolumeUp();
        controllerRadio.deviceVolumeUp();

        controllerRadio.devicePrevChanel();

        controllerRadio.deviceVolumeDown();
        controllerTv.deviceOn();

        universalController.off();

    }
}
