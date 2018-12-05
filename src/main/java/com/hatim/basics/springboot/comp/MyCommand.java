package com.hatim.basics.springboot.comp;

import javax.validation.constraints.Size;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCommand {

	@ShellMethod("Add 5 Numbers.")
	public long add5(@ShellOption(arity = 5) long[] numbers) {
		long sum = 0;
		for( long a : numbers ) {
			sum += a;
		}
		
		return sum;
	}

	//Should be used like 'addn 1,2,3,4,5'
	@ShellMethod(value = "Addition of two integers", group = "Calculator")
	public long addn(long... args) {
		long sum = 0;
		for( long a : args ) {
			sum += a;
		}
		
		return sum;
	}

	@ShellMethod(value = "Addition of two integers", group = "Calculator")
	public long add(long a, long b) {
		return a + b;
	}

	@ShellMethod(value = "Multiplication of two integers", group = "Calculator")
	public long multiply(long a, long b) {
		return a * b;
	}

	@ShellMethod(value = "Division of integer a by b", group = "Calculator")
	public long divide(long a, long b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}

	@ShellMethod(key = { "sub", "subtract" }, value = "Substraction of integer b from a", group = "Calculator")
	public long substract(long a, long b) {
		return a - b;
	}
	
	@ShellMethod("Say hello.")
    public String greet(@ShellOption(defaultValue="World") String who) {
            return "Hello " + who;
    }

	@ShellMethod("Say hello.")
    public String doIt(boolean flag) {
		return "You said : " + flag;
    }
	

	@ShellMethod("Change password.")
    public String changePassword(@Size(min = 8, max = 40) String password) {
            return "Password successfully set to " + password;
    }

	
}
