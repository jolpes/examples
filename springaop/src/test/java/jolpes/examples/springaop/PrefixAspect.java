package jolpes.examples.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PrefixAspect {

  @Around("execution(* jolpes.examples.springaop.*.*(..))")
  public Object prefix(ProceedingJoinPoint point) throws Throwable {
      Object result = point.proceed();
      if(result instanceof String) {
          result = String.format("aspect-prefix-%s", result);
      }
      return result;
  }
}
