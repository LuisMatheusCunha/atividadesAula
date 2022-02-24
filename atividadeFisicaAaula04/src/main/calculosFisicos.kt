class calculosFisicos {

    fun calForcaPeso (massa:Float, gravidade:Float): Float {
        return massa * gravidade
    }

    fun calForcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade * velocidade / raio)
    }

    fun calImpulso(tempoInicial: Float, tempoFinal: Float, movimentoInicial: Float, movimentoFinal): Float {
        return (tempoFinal - tempoInicial) + (movimentoFinal - movimentoInicial)
    }

    fun forcaElastica(constanteElastica: Float, deformacaoDoCorpo: Float) {
        return constanteElastica * deformacaoDoCorpo
    }

    fun calVeloMedia(deslocamento: Float, intervaloDeTempo: Float) {
        return deslocamento / intervaloDeTempo
    }

    fun calMovRetilineoUniforme(posicaoInicial: Float, velocidadeDeDeslocamento: Float, tempoDoDeslocamento: Float) {
        return posicaoInicial + (velocidadeDeDeslocamento * tempoDoDeslocamento)
    }

    fun calMovRetilineoVariado(velocidadeInicial: Float, aceleracao: Float, tempo: Float) {
        return velocidadeInicial + (aceleracao * tempo)
    }
}