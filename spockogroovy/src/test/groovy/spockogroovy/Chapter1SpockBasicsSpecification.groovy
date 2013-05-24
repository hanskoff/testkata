package spockogroovy

import spock.lang.Specification

/*
Although Spock uses a different terminology, many of its concepts and features are inspired from JUnit.

    Spock                   JUnit
    -----                   -----
    Specification           Test class
    setup()                 @Before
    cleanup()               @After
    setupSpec()             @BeforeClass
    cleanupSpec()           @AfterClass
    Feature                 Test
    Parametrized feature    Theory
    Condition               Assertion
    Exception condition     @Test(expected=...)
    @FailsWith              @Test(expected=...)
    Interaction             Mock expectation (EasyMock, JMock, ...)
*/

class Chapter1SpockBasicsSpecification extends Specification {

    def 'dodać 2 + 2 równa się 4'() {
        expect:
        2 + 2 == 4
    }

    def 'pusta lista jest pusta'() {
        setup:
        List aList = []

        expect:
        aList.empty
    }

    def 'gdy dodamy coś do listy, to już nie jest pusta'() {
        given:
        List aList = []

        when:
        aList << 'something'

        then:
        aList.size() == 1
    }
}
