package br.com.costa.service;

import br.com.costa.domain.entity.Pedido;
import br.com.costa.domain.enums.StatusPedido;
import br.com.costa.rest.dto.PedidoDTO;
import java.util.Optional;

public interface PedidoService {

    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);

}