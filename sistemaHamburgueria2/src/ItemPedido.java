class ItemPedido {
    String nome;
    int quantidade;
    double precoUnit;

    ItemPedido(String nome, int quantidade, double precoUnit) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
    }

    double getTotal() {
        return quantidade * precoUnit;
    }
}