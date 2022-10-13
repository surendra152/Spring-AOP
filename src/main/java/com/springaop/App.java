package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.services.PaymentService;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		
    	PaymentService paymentObject = con.getBean("payment",PaymentService.class);
    	
    	//print:payment started
    	//we add some code before or after method execution without modifying this code by the help of AOP
    	paymentObject.makePayment(130);
    	
    	
    	
    	
    }
}
