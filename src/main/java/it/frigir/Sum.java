package it.frigir;

public class Sum implements Expression {
    Money agumend;
    Money addend;

    public Sum(Money agumend, Money addend) {
        this.agumend = agumend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        return new Money(agumend.getAmount() + addend.getAmount(), to);
    }
}
