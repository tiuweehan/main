package seedu.algobase.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import seedu.algobase.commons.exceptions.IllegalValueException;
import seedu.algobase.model.commandhistory.CommandHistory;
import seedu.algobase.model.gui.GuiState;
import seedu.algobase.model.plan.Plan;
import seedu.algobase.model.problem.Problem;
import seedu.algobase.model.searchrule.problemsearchrule.ProblemSearchRule;
import seedu.algobase.model.tag.Tag;
import seedu.algobase.model.task.Task;

/**
 * Unmodifiable view of an algobase
 */
public interface ReadOnlyAlgoBase {

    /**
     * Returns the {@code Problem} with the same id in the algobase.
     */
    Problem findProblemById(Id problemId) throws IllegalValueException;

    /**
     * Returns an unmodifiable view of the problems list.
     * This list will not contain any duplicate problems.
     */
    ObservableList<Problem> getProblemList();

    /**
     * Returns an unmodifiable view of the tags list.
     * This list will not contain any duplicate tags.
     */
    ObservableList<Tag> getTagList();

    /**
     * Returns the {@code Tag} with the same id in the algobase.
     */
    Tag findTagById(Id tagId) throws IllegalValueException;

    /**
     * Returns an unmodifiable view of the plans list.
     */
    ObservableList<Plan> getPlanList();

    /**
     * Returns the {@code Plan} with the same id in the algobase.
     */
    Plan findPlanById(Id planId) throws IllegalValueException;

    /**
     * Returns an unmodifiable view of the current tasks list.
     */
    ObservableList<Task> getCurrentTaskList();

    /**
     * Returns an unmodifiable view of the command history.
     * Returns current plan name.
     */
    StringProperty getCurrentPlan();

    /**
     * Returns the number of solved tasks in current plan.
     */
    IntegerProperty getCurrentSolvedCount();

    /**
     * Returns the number of solved tasks in current plan.
     */
    IntegerProperty getCurrentUnsolvedCount();

    /**
     * Returns an unmodifiable view of the find rule list.
     */
    ObservableList<ProblemSearchRule> getFindRules();

    /**
     * Returns an unmodifiable view of the command history.
     */
    ObservableList<CommandHistory> getCommandHistoryList();

    /**
     * Returns a view of the GuiState.
     */
    GuiState getGuiState();

}
