package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(16, 14),
    INTERMEDIATE(14, 12),
    ADVANCED(12, 10);

    private final int maxRuntime;
    private final int minRuntime;

    Runner(int maxRuntime, int minRuntime) {
        this.maxRuntime = maxRuntime;
        this.minRuntime = minRuntime;
    }

    public static Runner getFitness(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime <= runner.maxRuntime && marathonTime >= runner.minRuntime) {
                return runner;
            }
        }
        return null;
    }
}
