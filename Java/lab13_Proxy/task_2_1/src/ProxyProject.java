public class ProxyProject implements Project {

    private final String url;
    private Project realProject = null;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run(){
        if (realProject==null) {
            this.realProject = new RealProject(url);
        }
        realProject.run();
    }
}
