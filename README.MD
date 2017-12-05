
# Dagger2 example
## Main annotations:
1. `@Component`

2. `@Module`

3. `@Provide`

4. `@Inject`

5. Scope - `@Singleton`, and other hand-made.

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

### @Inject

Main advantage - constructor injection

```java

@Singleton
class MySingleton {

    @Inject
    MySingleton() {

    }

}

```

Module not required, all dependencies injected automatically:

```java

@Singleton
class MySingleton2 {

    @Inject
    MySingleton2(MySingleton other) {
    }
}
```
