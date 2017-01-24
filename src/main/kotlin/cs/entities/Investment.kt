package cs.entities

import com.google.common.base.Preconditions.checkArgument
import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.OwnableState
import net.corda.core.crypto.CompositeKey
import java.math.BigDecimal
import java.util.*

data class Investment(val total: BigDecimal,
                      val investor: Investor,
                      val loan: Loan,
                      val dateOfIssuing: Date = Date(),
                      override val contract: Contract,
                      override val owner: CompositeKey,
                      override val participants: List<CompositeKey>) : OwnableState {
    init {
        checkArgument(total.toDouble() > 0.0, "total == $total")
        checkNotNull(investor)
        checkNotNull(loan)
    }

    override fun withNewOwner(newOwner: CompositeKey): Pair<CommandData, OwnableState> = TODO()
}