package cs.entities

import com.google.common.base.Preconditions.checkArgument
import java.util.*

class CsEmployer(name:String, issuers: Collection<Issuer>) {
    init {
        checkArgument(!name.isBlank(), "Name is blank!")
        checkNotNull(issuers)
    }
    constructor(name: String) : this(name, ArrayList<Issuer>())
}