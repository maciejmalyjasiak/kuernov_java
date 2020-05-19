package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Number of letters entered, %s!";
    private final AtomicLong counter = new AtomicLong();
    Random age = new Random();
    private static final String women="Women";
    private static final String men="Men";


    private CountService countService;
    @Autowired // Wstrzykiwanie zależności przez konstruktor
    public GreetingController(CountService countService) {
        this.countService = countService;
    }

    @RequestMapping(path="/bye", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Not entered") String name )
    {
        int ammount = name.length();
        int ammount1=ammount-1;
        int last = name.lastIndexOf("a");
        if (name.equals("kuba"))
        {
            return new Greeting(counter.incrementAndGet(), String.format(template,
                    countService.count(name)), name,age.nextInt(80),men);
        }if (ammount1==last)
        {
            return new Greeting(counter.incrementAndGet(), String.format(template,
                    countService.count(name)), name,age.nextInt(80),women);
        }else
        {
            return new Greeting(counter.incrementAndGet(), String.format(template,
                    countService.count(name)), name,age.nextInt(80),men);
        }
    }
    @RequestMapping(path="/endpoint", method = GET) // odpowiada endpoin'tom http
    public Greeting endpoint(@RequestParam(value = "name", defaultValue = "Not entered") String name)
    {
        int ammount = name.length();
        int ammount1=ammount-1;
        int last = name.lastIndexOf("a");
        if (name.equals("kuba"))
        {
            return new Greeting(counter.incrementAndGet(), String.format(template,
                    countService.count(name)), name,age.nextInt(80),men);
        }if (ammount1==last)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template,
                countService.count(name)), name,age.nextInt(80),women);
    }else
    {
        return new Greeting(counter.incrementAndGet(), String.format(template,
                countService.count(name)), name,age.nextInt(80),men);
    }
    }

} 