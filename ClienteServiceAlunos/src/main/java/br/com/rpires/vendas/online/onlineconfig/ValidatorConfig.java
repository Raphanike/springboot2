/**
 * 
 */
package br.com.rpires.vendas.online.onlineconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;


@Configuration
public class ValidatorConfig {
	


	@Bean
    public LocalValidatorFactoryBean validatorFactory () {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	    bean.setValidationMessageSource(messageSource);
	    return bean;
    }
}
