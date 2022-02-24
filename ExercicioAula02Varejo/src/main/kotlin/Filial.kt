class Filial {

    var estoque: Estoque? = null
    var clientes: Clientes? = null
    var vendedores: Vendedores? = null
    var produtos: Produtos? = null

    constructor(
        estoque: Estoque,
        clientes: Clientes,
        vendedores: Vendedores,
        produtos: Produtos

    ){
        this.estoque = estoque
        this.clientes = clientes
        this.vendedores = vendedores
        this.produtos = produtos
    }

}