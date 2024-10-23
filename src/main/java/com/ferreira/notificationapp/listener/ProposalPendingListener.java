package com.ferreira.notificationapp.listener;

import com.ferreira.notificationapp.constant.MessageConstant;
import com.ferreira.notificationapp.domain.Proposal;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ProposalPendingListener {

    @RabbitListener(queues = "${rabbitmq.queue.proposal.pending}")
    public void proposalPending(Proposal proposal) {
        String message = String.format(MessageConstant.PROPOSAL_UNDER_ANALYSIS, proposal.getUser().getFirstName());
    }
}
