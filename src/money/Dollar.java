package money;

class Dollar {

    // テスト変更によりamountを扱うのはDollarクラスのみとなった
    private int amount;
    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
