/**
 * Item�C���^�[�t�F�[�X
 * ���̃C���^�[�t�F�[�X�́A�������邢�͎x�o�̂ǂ��炩���w���Ƃ��Ɏg�p���܂��B
 */
public interface Item {
    /**
     * ���t��ԋp���܂��B
     * @return ���t
     */
    public String getDate();

    /**
     * ���x�̖��̂�ԋp���܂��B
     * @return ���x�̖���
     */
    public String getName();

    /**
     * ��ނ�ԋp���܂��B
     * @return ���
     */
    public String getKind();

    /**
     * ���z��ԋp���܂��B
     * @return ���z
     */
    public int getAmount();

    /**
     * �c����ԋp���܂��B
     * @return �c��
     */
    public int getRemainder();
}
