package cs.entities

import com.google.common.base.Preconditions.checkArgument
import java.util.*

class Investor(val name: String, val investments: Collection<Investment>) {
    init {
        checkArgument(!name.isBlank(), "Name is blank!")
        checkNotNull(investments)
    }

    constructor(name: String) : this(name, ArrayList<Investment>())

    fun loansInvestedTo(): Collection<Loan> {
        return investments.map { it.loan }.toList()
    }
}