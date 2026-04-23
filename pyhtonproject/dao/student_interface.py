from abc import ABC, abstractmethod

class StudentInterface(ABC):

    @abstractmethod
    def add_student(self, name, course, marks):
        pass

    @abstractmethod
    def view_students(self):
        pass

    @abstractmethod
    def update_student(self, student_id, marks):
        pass

    @abstractmethod
    def delete_student(self, student_id):
        pass
