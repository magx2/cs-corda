package cs.corda.contracts

import net.corda.core.contracts.Contract
import net.corda.core.contracts.TransactionForContract
import net.corda.core.crypto.SecureHash

class IssueContract : Contract {
    override val legalContractReference: SecureHash = SecureHash.Companion.sha256("issue")

    override fun verify(tx: TransactionForContract) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}