package cs.entities

import com.google.common.base.Preconditions.checkArgument
import java.math.BigDecimal
import java.util.*

class Loan(val total: BigDecimal, val interestRate: BigDecimal, val maturityDate: Date, val minimalInvest: BigDecimal, val expires: Date) {
    init {
        checkArgument(total.toDouble() > 0, "total == $total")
        checkArgument(interestRate.toDouble() > 0, "interestRate == $interestRate")
        val now = Date()
        checkArgument(maturityDate > now, "maturityDate == ${maturityDate.time} > now == ${now.time}")
        checkArgument(minimalInvest.toDouble() > 0, "minimalInvest== $minimalInvest")
        checkArgument(expires > now, "expires == ${expires.time} > now == ${now.time}")
    }
}