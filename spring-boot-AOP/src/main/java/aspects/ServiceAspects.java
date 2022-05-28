package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceAspects {

    @Before("execution(* service.*.*(..))")
    public void mesajMetoduOnce(JoinPoint joinPoint) {
        System.out.println("metoddan önce çalıştı parametre"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());


    }

    @After("execution(* service.*.*(..))")
    public void mesajMetoduSonra(JoinPoint joinPoint) {
        System.out.println("metoddan sonra hemen çalıştı parametre"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

}
