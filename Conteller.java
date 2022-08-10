import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Conteller {
    @RequestMapping(path = "/hey",method = RequestMethod.GET)
    public String get(){
        return "Hey from spring";
    }


    @RequestMapping(path = "/Bye",method = RequestMethod.GET)
    public String get1() {
        return "Everything OK";
    }



        @RequestMapping(path = "/health",method = RequestMethod.GET)
        public String get2() {
            return "Server health is up running";

        }
}
