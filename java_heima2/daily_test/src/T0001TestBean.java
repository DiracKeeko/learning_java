// 当容器启动时，会扫描并解析 @Configuration 注解的类，并创建相应的 bean 定义。
// 由于存在相同名称的 getCar() 方法，Spring 容器会根据配置的优先级来确定要创建的 bean。
// 一般情况下，后定义的 bean 会覆盖先定义的 bean。
@configuration
public class AutoCarConfig {
    @Bean
    @ConditionalOnMissingBean
    // @ConditionalOnMissingBean 注解表示只有当不存在同名的 bean 时才会创建该 bean。
    public Car getCar() {
        return new Ford();
    }
}

@Configuration
public class CarConfig {
    @Bean
    public Car getCar() {
        return new Chevy();
    }
}

public class CarService {
    @Inject
    private Car myCar;
    // 这里最终会执行 new Chevy();
}
