package W2_JUnit_Mockito.MOCKITOExercises.Exc1_MockingAndStubbing;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData(); // Call to external API
    }
}
