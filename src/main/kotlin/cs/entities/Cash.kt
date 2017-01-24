package cs.entities

import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.OwnableState
import net.corda.core.crypto.CompositeKey

class Cash(
        override val contract: Contract,
        override val owner: CompositeKey,
        override val participants: List<CompositeKey>) : OwnableState {

    override fun withNewOwner(newOwner: CompositeKey): Pair<CommandData, OwnableState> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}