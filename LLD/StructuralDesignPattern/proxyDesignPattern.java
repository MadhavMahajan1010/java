package StructuralDesignPattern;
/* used to control access/behaviour
 * what if dont proviode control
 * it will provide unauthorized access
 * system overload
 * increased bandwidth costsd
 */

/* imagine the scenario of netfix there will be a proxy layer between the real video service and the users
 * which will handle authorized user check, caching of the videos and rate limiting on the no of users
 * the users cant directly interact with the real video service they would have to go through the proxy video service
 * only thus providing controlled access
 */
interface VideoPlayer{
    public void playVideo();
}
class RealVideoPlayer implements VideoPlayer{

    @Override
    public void playVideo(){
        System.out.println("playing video");
    }
}

class ProxyVideoPlayer implements VideoPlayer{

    @Override
    public void playVideo(){

    }

    // similarly handle caching issues

    // handle rate limiting 

    // handle unauthorized users
}

public class proxyDesignPattern {
    
}
