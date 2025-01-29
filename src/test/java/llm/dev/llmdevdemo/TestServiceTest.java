package llm.dev.llmdevdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    private TestService testService;

    @BeforeEach
    void setUp() {
        testService = new TestService();
    }

    @Test
    void should_return_right_num_when_sum_by_tow_num() {
        // given
        int num1 = 1;
        int num2 = 2;

        // when
        int result = testService.sum(num1, num2);

        // then
        assertThat(result).isEqualTo(num1 + num2);
    }
}