package cs.entities

import com.google.common.base.Preconditions.checkArgument
import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.OwnableState
import net.corda.core.crypto.CompositeKey
import java.math.BigDecimal
import java.util.*

class Loan(val total: BigDecimal,
           val interestRate: BigDecimal,
           val maturityDate: Date,
           val minimalInvest: BigDecimal,
           val expires: Date,
           override val owner: CompositeKey,
           override val contract: Contract,
           override val participants: List<CompositeKey>) : OwnableState{

    init {
        checkArgument(total.toDouble() > 0, "total == $total")
        checkArgument(interestRate.toDouble() > 0, "interestRate == $interestRate")
        val now = Date()
        checkArgument(maturityDate > now, "maturityDate == ${maturityDate.time} > now == ${now.time}")
        checkArgument(minimalInvest.toDouble() > 0, "minimalInvest== $minimalInvest")
        checkArgument(expires > now, "expires == ${expires.time} > now == ${now.time}")
    }

    override fun withNewOwner(newOwner: CompositeKey): Pair<CommandData, OwnableState> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}