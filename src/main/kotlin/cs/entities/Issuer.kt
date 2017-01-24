package cs.entities

import com.google.common.base.Preconditions.checkArgument
import java.util.*

class Issuer(val name: String, val loans: Collection<Loan>) {
    init {
        checkArgument(!name.isBlank(), "name is blank!")
        checkNotNull(loans)
    }

    constructor(name: String) : this(name, ArrayList<Loan>())
}