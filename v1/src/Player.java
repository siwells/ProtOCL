
/*
 * @(#)Player.java
 *
 * Generated by <a href="http://lci.cs.ubbcluj.ro/ocle/>OCLE 2.0</a>
 * using <a href="http://jakarta.apache.org/velocity/">
 * Velocity Template Engine 1.3rc1</a>
 */
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ro.ubbcluj.lci.codegen.framework.ocl.BasicConstraintChecker;
import ro.ubbcluj.lci.codegen.framework.ocl.CollectionUtilities;

/**
 *
 * @author unascribed
 */
public class Player {

    
    public Move makeMove() {

        
        class ConstraintChecker {

            
            Move result;
            
            public void checkPreconditions() {

            }
            
            public void checkPostconditions() {

                check_postcondition();
                check_postcondition0();
                check_postcondition1();
                check_postcondition2();
                check_postcondition3();
                check_postcondition4();
                check_postcondition5();
                check_postcondition6();
                check_postcondition7();

            }
            
            public void check_postcondition() {

                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                int nGetSize = dialogueHistoryHistory.getSize();
                boolean bEquals = nGetSize == 0;
                String strGetType = result.getType();
                boolean bEquals0 = strGetType.equals("Question");
                MoveContent moveContentContent = result.getContent();
                DialogueGame dialogueGameGame0 = Player.this.getGame();
                Proposition propositionGetThesis = dialogueGameGame0.getThesis();
                boolean bEquals1 = moveContentContent.equals(propositionGetThesis);
                boolean bAnd = bEquals0 && bEquals1;
                boolean bImplies = !bEquals || bAnd;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition0() {

                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType = moveGetPreviousMove.getType();
                boolean bEquals = strGetType.equals("Question");
                String strGetType0 = result.getType();
                boolean bEquals0 = strGetType0.equals("Assertion");
                MoveContent moveContentContent = result.getContent();
                DialogueGame dialogueGameGame0 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory0 = dialogueGameGame0.getHistory();
                Move moveGetPreviousMove0 = dialogueHistoryHistory0.getPreviousMove();
                MoveContent moveContentContent0 = moveGetPreviousMove0.getContent();
                boolean bEquals1 = moveContentContent.equals(moveContentContent0);
                boolean bAnd = bEquals0 && bEquals1;
                String strGetType1 = result.getType();
                boolean bEquals2 = strGetType1.equals("Assertion");
                MoveContent moveContentContent1 = result.getContent();
                DialogueGame dialogueGameGame1 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory1 = dialogueGameGame1.getHistory();
                Move moveGetPreviousMove1 = dialogueHistoryHistory1.getPreviousMove();
                MoveContent moveContentContent2 = moveGetPreviousMove1.getContent();
                MoveContent moveContentGetNegation = moveContentContent2.getNegation();
                boolean bEquals3 = moveContentContent1.equals(moveContentGetNegation);
                boolean bAnd0 = bEquals2 && bEquals3;
                boolean bOr0 = bAnd || bAnd0;
                String strGetType2 = result.getType();
                boolean bEquals4 = strGetType2.equals("Withdrawal");
                MoveContent moveContentContent3 = result.getContent();
                DialogueGame dialogueGameGame2 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory2 = dialogueGameGame2.getHistory();
                Move moveGetPreviousMove2 = dialogueHistoryHistory2.getPreviousMove();
                MoveContent moveContentContent4 = moveGetPreviousMove2.getContent();
                boolean bEquals5 = moveContentContent3.equals(moveContentContent4);
                boolean bAnd1 = bEquals4 && bEquals5;
                boolean bOr = bOr0 || bAnd1;
                boolean bImplies = !bEquals || bOr;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition0' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition1() {

                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType = moveGetPreviousMove.getType();
                boolean bEquals = strGetType.equals("Challenge");
                String strGetType0 = result.getType();
                boolean bEquals0 = strGetType0.equals("Withdrawal");
                MoveContent moveContentContent = result.getContent();
                DialogueGame dialogueGameGame0 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory0 = dialogueGameGame0.getHistory();
                Move moveGetPreviousMove0 = dialogueHistoryHistory0.getPreviousMove();
                MoveContent moveContentContent0 = moveGetPreviousMove0.getContent();
                boolean bEquals1 = moveContentContent.equals(moveContentContent0);
                boolean bAnd = bEquals0 && bEquals1;
                String strGetType1 = result.getType();
                boolean bEquals2 = strGetType1.equals("Resolve");
                MoveContent moveContentContent1 = result.getContent();
                DialogueGame dialogueGameGame1 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory1 = dialogueGameGame1.getHistory();
                Move moveGetPreviousMove1 = dialogueHistoryHistory1.getPreviousMove();
                MoveContent moveContentContent2 = moveGetPreviousMove1.getContent();
                boolean bEquals3 = moveContentContent1.equals(moveContentContent2);
                boolean bAnd0 = bEquals2 && bEquals3;
                boolean bOr0 = bAnd || bAnd0;
                String strGetType2 = result.getType();
                boolean bEquals4 = strGetType2.equals("Assertion");
                MoveContent moveContentContent3 = result.getContent();
                CommitmentStore commitmentStoreStore = Player.this.getStore();
                boolean bIsSelfSupported = moveContentContent3.isSelfSupported(commitmentStoreStore);
                boolean bNot = !bIsSelfSupported;
                boolean bAnd1 = bEquals4 && bNot;
                boolean bOr = bOr0 || bAnd1;
                boolean bImplies = !bEquals || bOr;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition1' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition2() {

                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType = moveGetPreviousMove.getType();
                boolean bEquals = strGetType.equals("Resolve");
                String strGetType0 = result.getType();
                boolean bEquals0 = strGetType0.equals("Withdrawal");
                MoveContent moveContentContent = result.getContent();
                DialogueGame dialogueGameGame0 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory0 = dialogueGameGame0.getHistory();
                Move moveGetPreviousMove0 = dialogueHistoryHistory0.getPreviousMove();
                MoveContent moveContentContent0 = moveGetPreviousMove0.getContent();
                boolean bEquals1 = moveContentContent.equals(moveContentContent0);
                boolean bAnd = bEquals0 && bEquals1;
                String strGetType1 = result.getType();
                boolean bEquals2 = strGetType1.equals("Withdrawal");
                MoveContent moveContentContent1 = result.getContent();
                DialogueGame dialogueGameGame1 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory1 = dialogueGameGame1.getHistory();
                Move moveGetPreviousMove1 = dialogueHistoryHistory1.getPreviousMove();
                MoveContent moveContentContent2 = moveGetPreviousMove1.getContent();
                MoveContent moveContentGetNegation = moveContentContent2.getNegation();
                boolean bEquals3 = moveContentContent1.equals(moveContentGetNegation);
                boolean bAnd0 = bEquals2 && bEquals3;
                boolean bOr1 = bAnd || bAnd0;
                String strGetType2 = result.getType();
                boolean bEquals4 = strGetType2.equals("Assertion");
                MoveContent moveContentContent3 = result.getContent();
                DialogueGame dialogueGameGame2 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory2 = dialogueGameGame2.getHistory();
                Move moveGetPreviousMove2 = dialogueHistoryHistory2.getPreviousMove();
                MoveContent moveContentContent4 = moveGetPreviousMove2.getContent();
                boolean bEquals5 = moveContentContent3.equals(moveContentContent4);
                boolean bAnd1 = bEquals4 && bEquals5;
                boolean bOr0 = bOr1 || bAnd1;
                String strGetType3 = result.getType();
                boolean bEquals6 = strGetType3.equals("Assertion");
                MoveContent moveContentContent5 = result.getContent();
                DialogueGame dialogueGameGame3 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory3 = dialogueGameGame3.getHistory();
                Move moveGetPreviousMove3 = dialogueHistoryHistory3.getPreviousMove();
                MoveContent moveContentContent6 = moveGetPreviousMove3.getContent();
                MoveContent moveContentGetNegation0 = moveContentContent6.getNegation();
                boolean bEquals7 = moveContentContent5.equals(moveContentGetNegation0);
                boolean bAnd2 = bEquals6 && bEquals7;
                boolean bOr = bOr0 || bAnd2;
                boolean bImplies = !bEquals || bOr;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition2' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition3() {

                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType = moveGetPreviousMove.getType();
                boolean bEquals = strGetType.equals("Withdrawal");
                DialogueGame dialogueGameGame0 = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory0 = dialogueGameGame0.getHistory();
                Move moveGetPreviousMove0 = dialogueHistoryHistory0.getPreviousMove();
                String strGetType0 = moveGetPreviousMove0.getType();
                boolean bEquals0 = strGetType0.equals("Assertion");
                boolean bOr = bEquals || bEquals0;
                String strGetType1 = result.getType();
                boolean bEquals1 = strGetType1.equals("Assertion");
                boolean bAnd = bOr && bEquals1;
                CommitmentStore commitmentStoreStore = Player.this.getStore();
                Set setContent = commitmentStoreStore.getContent();
                MoveContent moveContentContent = result.getContent();
                boolean bExcludes = CollectionUtilities.excludes(setContent, moveContentContent);
                CommitmentStore commitmentStoreListenerStore = Player.this.getListenerStore();
                Set setContent0 = commitmentStoreListenerStore.getContent();
                MoveContent moveContentContent0 = result.getContent();
                boolean bExcludes0 = CollectionUtilities.excludes(setContent0, moveContentContent0);
                boolean bOr0 = bExcludes || bExcludes0;
                boolean bImplies = !bAnd || bOr0;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition3' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition4() {

                String strGetType = result.getType();
                boolean bEquals = strGetType.equals("Challenge");
                CommitmentStore commitmentStoreListenerStore = Player.this.getListenerStore();
                Set setContent = commitmentStoreListenerStore.getContent();
                MoveContent moveContentContent = result.getContent();
                boolean bIncludes = CollectionUtilities.includes(setContent, moveContentContent);
                boolean bImplies = !bEquals || bIncludes;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition4' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition5() {

                String strGetType = result.getType();
                boolean bEquals = strGetType.equals("Withdrawal");
                String strGetType0 = result.getType();
                boolean bEquals0 = strGetType0.equals("Challenge");
                boolean bOr = bEquals || bEquals0;
                Turn turnTurn = result.getTurn();
                Player playerPlayer = turnTurn.getPlayer();
                CommitmentStore commitmentStoreStore = playerPlayer.getStore();
                Set setContent = commitmentStoreStore.getContent();
                MoveContent moveContentContent = result.getContent();
                boolean bExcludes = CollectionUtilities.excludes(setContent, moveContentContent);
                boolean bImplies = !bOr || bExcludes;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition5' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition6() {

                String strGetType = result.getType();
                boolean bEquals = strGetType.equals("Assertion");
                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType0 = moveGetPreviousMove.getType();
                boolean bEquals0 = strGetType0.equals("Challenge");
                boolean bNot = !bEquals0;
                boolean bAnd = bEquals && bNot;
                Turn turnTurn = result.getTurn();
                Player playerPlayer = turnTurn.getPlayer();
                CommitmentStore commitmentStoreStore = playerPlayer.getStore();
                Set setContent = commitmentStoreStore.getContent();
                MoveContent moveContentContent = result.getContent();
                boolean bIncludes = CollectionUtilities.includes(setContent, moveContentContent);
                boolean bImplies = !bAnd || bIncludes;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition6' failed for object "+Player.this);
                }

            }
            
            public void check_postcondition7() {

                String strGetType = result.getType();
                boolean bEquals = strGetType.equals("Assertion");
                DialogueGame dialogueGameGame = Player.this.getGame();
                DialogueHistory dialogueHistoryHistory = dialogueGameGame.getHistory();
                Move moveGetPreviousMove = dialogueHistoryHistory.getPreviousMove();
                String strGetType0 = moveGetPreviousMove.getType();
                boolean bEquals0 = strGetType0.equals("Challenge");
                boolean bAnd = bEquals && bEquals0;
                Turn turnTurn = result.getTurn();
                Player playerPlayer = turnTurn.getPlayer();
                CommitmentStore commitmentStoreStore = playerPlayer.getStore();
                Set setContent = commitmentStoreStore.getContent();
                MoveContent moveContentContent = result.getContent();
                boolean bIncludes = CollectionUtilities.includes(setContent, moveContentContent);
                Turn turnTurn0 = result.getTurn();
                Player playerPlayer0 = turnTurn0.getPlayer();
                CommitmentStore commitmentStoreStore0 = playerPlayer0.getStore();
                Set setInference = commitmentStoreStore0.getInference();
                //evaluate 'exists(getData()=result.content and getConclusion()=game.history.getPreviousMove().content)':
                boolean bExists = false;
                final Iterator iter = setInference.iterator();
                while (!bExists && iter.hasNext()) {
                    final Inference iter1 = (Inference)iter.next();
                    MoveContent moveContentGetData = iter1.getData();
                    MoveContent moveContentContent0 = result.getContent();
                    boolean bEquals1 = moveContentGetData.equals(moveContentContent0);
                    Proposition propositionGetConclusion = iter1.getConclusion();
                    DialogueGame dialogueGameGame0 = Player.this.getGame();
                    DialogueHistory dialogueHistoryHistory0 = dialogueGameGame0.getHistory();
                    Move moveGetPreviousMove0 = dialogueHistoryHistory0.getPreviousMove();
                    MoveContent moveContentContent1 = moveGetPreviousMove0.getContent();
                    boolean bEquals2 = propositionGetConclusion.equals(moveContentContent1);
                    boolean bAnd1 = bEquals1 && bEquals2;
                    
                    bExists = bAnd1;
                }
                boolean bAnd0 = bIncludes && bExists;
                boolean bImplies = !bAnd || bAnd0;
                if (!bImplies) {
                    System.err.println("postcondition 'postcondition7' failed for object "+Player.this);
                }

            }

        }
        ConstraintChecker checker = new ConstraintChecker();
        checker.checkPreconditions();
        checker.result = internal_makeMove();

        checker.checkPostconditions();
        return checker.result;

    }
    
    public final CommitmentStore getListenerStore() {

        return listenerStore;
    }
    
    public final void setListenerStore(CommitmentStore arg) {

        listenerStore = arg;
    }
    
    public final Set getTurn() {

        if (turn == null) {
            return java.util.Collections.EMPTY_SET;
        }
        return java.util.Collections.unmodifiableSet(turn);
    }
    
    public final void addTurn(Turn arg) {

        if (arg != null) {
            if (turn == null) {
                turn = new LinkedHashSet();
            }
            if (turn.add(arg)) {
                arg.setPlayer(this);
            }
        }

    }
    
    public final void removeTurn(Turn arg) {

        if (turn != null && arg != null) {
            if (turn.remove(arg)) {
                arg.setPlayer(null);
            }
        }

    }
    
    public final DialogueGame getGame() {

        return game;
    }
    
    public final void setGame(DialogueGame arg) {

        game = arg;
    }
    
    public final CommitmentStore getStore() {

        return store;
    }
    
    public final void setStore(CommitmentStore arg) {

        store = arg;
    }
    
    private Move internal_makeMove() {

        return null;

    }
    
    public Player() {

    }
    
    public class ConstraintChecker extends BasicConstraintChecker {

        
        public void checkConstraints() {

            super.checkConstraints();
            check_Player_invariant();

        }
        
        public void check_Player_invariant() {

            Set set = CollectionUtilities.newSet();
            CollectionUtilities.add(set, "Assertion");
            CollectionUtilities.add(set, "Question");
            CollectionUtilities.add(set, "Challenge");
            CollectionUtilities.add(set, "Resolve");
            CollectionUtilities.add(set, "Withdrawal");
            Set setTurn = Player.this.getTurn();
            //evaluate 'collect(move)':
            List bagCollect = CollectionUtilities.newBag();
            final Iterator iter = setTurn.iterator();
            while (iter.hasNext()) {
                final Turn decl = (Turn)iter.next();
                Set setMove = decl.getMove();
                
                bagCollect.add(setMove);
            }
            bagCollect = CollectionUtilities.flatten(bagCollect);
            
            //evaluate 'collect(getType())':
            List bagCollect0 = CollectionUtilities.newBag();
            final Iterator iter0 = bagCollect.iterator();
            while (iter0.hasNext()) {
                final Move decl0 = (Move)iter0.next();
                String strGetType = decl0.getType();
                
                bagCollect0.add(strGetType);
            }
            bagCollect0 = CollectionUtilities.flatten(bagCollect0);
            
            boolean bIncludesAll = CollectionUtilities.includesAll(set, bagCollect0);
            if (!bIncludesAll) {
                System.err.println("invariant 'invariant' failed for object "+Player.this);
            }

        }

    }
    
    public CommitmentStore listenerStore;
    
    public Set turn;
    
    public DialogueGame game;
    
    public CommitmentStore store;

}
