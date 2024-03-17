package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction.Operation;
import java.util.HashMap;
import java.util.Map;

public class HandlerStrategy {
    private static Map<Operation, OperationHandler> strategyMap;

    public HandlerStrategy(Map<Operation, OperationHandler> strategyMap) {
        HandlerStrategy.strategyMap = new HashMap<>();
    }

    public Map<Operation, OperationHandler> getStrategyMap() {
        return strategyMap;
    }

    public OperationHandler getStrategy(Operation operationType) {
        return strategyMap.get(operationType);
    }
}
