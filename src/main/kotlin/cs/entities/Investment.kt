package cs.entities

import com.google.common.base.Preconditions.checkArgument
import java.math.BigDecimal

class Investment(val total: BigDecimal, val investor: Investor, val loan: Loan) {
    init {
        checkArgument(total.toDouble() > 0.0, "total == $total")
        checkNotNull(investor)
        checkNotNull(loan)
    }
}