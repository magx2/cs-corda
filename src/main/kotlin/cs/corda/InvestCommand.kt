package cs.corda

import net.corda.core.contracts.TypeOnlyCommandData

interface InvestCommand {
    class issue : TypeOnlyCommandData()
    class invest : TypeOnlyCommandData()
}