package org.scrinch.model;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.awt.Toolkit.*;

public class MemberFactoryTest extends TestCase {

    public MemberFactoryTest(String testName) {
        super(testName);
    }

    public <MemberSortablePropertiesChanged> void testMemberSortablePropertiesChanged() {
        List<Member> members = new ArrayList<>();
        members.add(new Member("sam"));
        members.add(new Member("austin"));
        members.add(new Member("james"));

        List<Member> expectedMembers = new ArrayList<>();
        expectedMembers.add(new Member("sam"));
        expectedMembers.add(new Member("austin"));
        expectedMembers.add(new Member("james"));
        assertEquals(expectedMembers, members);
    }

    public Member findMemberWithNickname(String name) {
        Member member = findMemberWithNickname("John");
        assertEquals("John", member.getNickname());
        return member;
    }
    public void getMembersAsString() {
        Collection<Member> members = new ArrayList<>();
        members.add(new Member("Ria"));
        members.add(new Member("Sam"));
        String expectedResult = "Ria,Sam";
        String actualResult = Member.getMembersAsString(members);
        assertEquals(expectedResult, actualResult);
    }
    public void getMembersAsStringWithSingleMember() {
        Collection<Member> members = new ArrayList<>();
        members.add(new Member("Jane"));
        String expectedResult = "Jane";
        String actualResult = Member.getMembersAsString(members);
        assertEquals(expectedResult, actualResult);
    }
    public void getMembersAsStringWithEmptyCollection() {
        Collection<Member> members = new ArrayList<>();
        String expectedResult = "";
        String actualResult = Member.getMembersAsString(members);
        assertEquals(expectedResult, actualResult);
    }

    public void testCreateMember() {
        ScrinchEnvToolkit toolkit = new ScrinchEnvToolkit();
        MemberFactory myClass = new MemberFactory(toolkit);
        Member member = myClass.createMember();
        assertEquals("User1", member.getNickname());
       
    }
    public void testMemberChanged() {
    }
}
