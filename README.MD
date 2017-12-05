
# Dagger2 example
## Main annotations:
1. `@Component`

2. `@Module`

3. `@Provide`

4. Scope - `@Singleton`, and other hand-made.

### @Module & @Provide

```java

@Module
class MyModule {

    @Provide
    @Singleton
    MySingleton provide() {
       return new MySingleton();
    }
}
```


### @Component

```java
@Component(modules = MyModule.class)
@Singleton
interface MyComponent {
    MySingleton getMySingleton();

    void inject(UsageClass usage);
}

```

