package Lectures.DesingPatterns.BehaviouralDP.Strategy.After2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculationStrategy> stratergies = new HashMap<>();

    public void register(TransportMode mode, PathCalculationStrategy stratergy) {
        stratergies.put(mode, stratergy);
    }

    public PathCalculationStrategy get(TransportMode mode) {
        return stratergies.get(mode);
    }
}
