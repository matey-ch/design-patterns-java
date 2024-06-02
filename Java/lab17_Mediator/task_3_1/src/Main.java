public class Main {

  public static void main(String[] args) {

    Runway runway = new Runway();
    PlanesInFlight planesInFlight = new PlanesInFlight();
    PlanesOnGround planesOnGround = new PlanesOnGround();

    AirTrafficMediator mediator = new AirTrafficMediator();

    Plane plane1 = new Plane(123);
    Plane plane2 = new Plane(124);

    runway.setMediator(mediator);
    planesInFlight.setMediator(mediator);
    planesOnGround.setMediator(mediator);
    plane1.setMediator(mediator);
    plane2.setMediator(mediator);

    mediator.addComponent(runway);
    mediator.addComponent(planesInFlight);
    mediator.addComponent(planesOnGround);
    mediator.addComponent(plane1);
    mediator.addComponent(plane2);

    plane1.takeOff();
    plane2.takeOff();
    plane2.land();
    plane1.takeOff();
    plane2.takeOff();
    plane1.land();

  }

}
