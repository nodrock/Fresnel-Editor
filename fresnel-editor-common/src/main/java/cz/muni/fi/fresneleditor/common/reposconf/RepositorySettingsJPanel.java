/*
 * Fresnel Editor
 */

package cz.muni.fi.fresneleditor.common.reposconf;

import java.io.File;

import org.springframework.util.Assert;

import cz.muni.fi.fresneleditor.common.FresnelEditorConstants;
import cz.muni.fi.fresneleditor.common.config.RepositoryConfiguration;
import cz.muni.fi.fresneleditor.model.IRepositoryConfiguration;
import cz.muni.fi.fresneleditor.model.BaseRepositoryDao.RepositoryDomain;
import cz.muni.fi.fresneleditor.model.BaseRepositoryDao.RepositoryType;

/**
 * @author Igor Zemsky (zemsky@mail.muni.cz)
 */
public class RepositorySettingsJPanel extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form RepositorySettingsJPanel
	 */
	public RepositorySettingsJPanel() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		typeBtnGroup = new javax.swing.ButtonGroup();
		domainBtnGroup = new javax.swing.ButtonGroup();
		repositoryUrlLabel = new javax.swing.JLabel();
		repositoryUrlTxtField = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		dataDomainRadio = new javax.swing.JRadioButton();
		frenselDomainRadio = new javax.swing.JRadioButton();
		jPanel3 = new javax.swing.JPanel();
		localRadio = new javax.swing.JRadioButton();
		httpRadio = new javax.swing.JRadioButton();
		repositoryNameTxtField = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();

		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(
						cz.muni.fi.fresneleditor.common.FresnelApplication.class)
				.getContext().getResourceMap(RepositorySettingsJPanel.class);
		setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap
				.getString("Form.border.title"))); // NOI18N
		setName("Form"); // NOI18N

		repositoryUrlLabel.setFont(resourceMap.getFont("localRadio.font")); // NOI18N
		repositoryUrlLabel.setText(resourceMap
				.getString("repositoryUrlLabel.text")); // NOI18N
		repositoryUrlLabel.setName("repositoryUrlLabel"); // NOI18N

		repositoryUrlTxtField.setDisabledTextColor(resourceMap
				.getColor("repositoryUrlTxtField.disabledTextColor")); // NOI18N
		repositoryUrlTxtField.setName("repositoryUrlTxtField"); // NOI18N
		repositoryUrlTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				repositoryUrlTxtFieldKeyReleased(evt);
			}
		});

		jPanel2.setBorder(javax.swing.BorderFactory
				.createTitledBorder(resourceMap
						.getString("jPanel2.border.title"))); // NOI18N
		jPanel2.setName("jPanel2"); // NOI18N

		domainBtnGroup.add(dataDomainRadio);
		dataDomainRadio.setFont(resourceMap.getFont("localRadio.font")); // NOI18N
		dataDomainRadio.setSelected(true);
		dataDomainRadio.setText(resourceMap.getString("dataDomainRadio.text")); // NOI18N
		dataDomainRadio.setName("dataDomainRadio"); // NOI18N

		domainBtnGroup.add(frenselDomainRadio);
		frenselDomainRadio.setFont(resourceMap.getFont("localRadio.font")); // NOI18N
		frenselDomainRadio.setText(resourceMap
				.getString("frenselDomainRadio.text")); // NOI18N
		frenselDomainRadio.setName("frenselDomainRadio"); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																dataDomainRadio)
														.addComponent(
																frenselDomainRadio))
										.addContainerGap(178, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(dataDomainRadio)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(frenselDomainRadio)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel3.setBorder(javax.swing.BorderFactory
				.createTitledBorder(resourceMap
						.getString("jPanel3.border.title"))); // NOI18N
		jPanel3.setName("jPanel3"); // NOI18N

		typeBtnGroup.add(localRadio);
		localRadio.setFont(resourceMap.getFont("localRadio.font")); // NOI18N
		localRadio.setSelected(true);
		localRadio.setText(resourceMap.getString("localRadio.text")); // NOI18N
		localRadio.setName("localRadio"); // NOI18N
		localRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				localRadioActionPerformed(evt);
			}
		});

		typeBtnGroup.add(httpRadio);
		httpRadio.setFont(resourceMap.getFont("localRadio.font")); // NOI18N
		httpRadio.setText(resourceMap.getString("httpRadio.text")); // NOI18N
		httpRadio.setName("httpRadio"); // NOI18N
		httpRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				httpRadioActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																localRadio)
														.addComponent(httpRadio))
										.addContainerGap(260, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(localRadio)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(httpRadio)));

		repositoryNameTxtField.setDisabledTextColor(resourceMap
				.getColor("repositoryNameTxtField.disabledTextColor")); // NOI18N
		repositoryNameTxtField.setName("repositoryNameTxtField"); // NOI18N
		repositoryNameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				repositoryNameTxtFieldKeyReleased(evt);
			}
		});

		jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
		jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
		jLabel1.setName("jLabel1"); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		repositoryUrlLabel)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		repositoryUrlTxtField,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		547,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										repositoryNameTxtField,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										290,
																										Short.MAX_VALUE))
																				.addComponent(
																						jPanel2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jPanel3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														repositoryNameTxtField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(jPanel2, 0, 74,
														Short.MAX_VALUE)
												.addComponent(
														jPanel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														72,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														repositoryUrlLabel)
												.addComponent(
														repositoryUrlTxtField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
	}// </editor-fold>//GEN-END:initComponents

	private void repositoryUrlTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_repositoryUrlTxtFieldKeyReleased
		// TODO add your handling code here:
	}// GEN-LAST:event_repositoryUrlTxtFieldKeyReleased

	private void localRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_localRadioActionPerformed
		repositoryTypeChanged();
	}// GEN-LAST:event_localRadioActionPerformed

	private void httpRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_httpRadioActionPerformed
		repositoryTypeChanged();
	}// GEN-LAST:event_httpRadioActionPerformed

	private void repositoryNameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_repositoryNameTxtFieldKeyReleased
		// TODO add your handling code here:
	}// GEN-LAST:event_repositoryNameTxtFieldKeyReleased

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JRadioButton dataDomainRadio;
	private javax.swing.ButtonGroup domainBtnGroup;
	private javax.swing.JRadioButton frenselDomainRadio;
	private javax.swing.JRadioButton httpRadio;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JRadioButton localRadio;
	private javax.swing.JTextField repositoryNameTxtField;
	private javax.swing.JLabel repositoryUrlLabel;
	private javax.swing.JTextField repositoryUrlTxtField;
	private javax.swing.ButtonGroup typeBtnGroup;

	// End of variables declaration//GEN-END:variables

	public void update(IRepositoryConfiguration conf) {
		if (conf != null) {
			repositoryNameTxtField.setText(conf.getName());
			repositoryUrlTxtField.setText(null);

			// type
			switch (conf.getType()) {
			case HTTP:
				httpRadio.setSelected(true);
				repositoryUrlTxtField.setText(conf.getLocation());
				break;
			case LOCAL:
				localRadio.setSelected(true);
				break;
			default:
				throw new ArrayIndexOutOfBoundsException();
			}

			// domain
			switch (conf.getDomain()) {
			case DATA:
				dataDomainRadio.setSelected(true);
				break;
			case FRESNEL:
				frenselDomainRadio.setSelected(true);
				break;
			default:
				throw new ArrayIndexOutOfBoundsException();
			}
		} else {
			// initialize the form's state
			repositoryNameTxtField.setText(null);
		}

	}

	public RepositoryConfiguration getRepositoryConfiguration() {
		RepositoryConfiguration conf = new RepositoryConfiguration();

		// name
		conf.setName(repositoryNameTxtField.getText());

		// domain
		if (dataDomainRadio.isSelected()) {
			conf.setDomain(RepositoryDomain.DATA);
		} else if (frenselDomainRadio.isSelected()) {
			conf.setDomain(RepositoryDomain.FRESNEL);
		} else {
			Assert.isTrue(false, "Unhandeled repository domain");
		}

		// type and location
		if (httpRadio.isSelected()) {
			conf.setType(RepositoryType.HTTP);
			conf.setLocation(repositoryUrlTxtField.getText());
		} else if (localRadio.isSelected()) {
			conf.setType(RepositoryType.LOCAL);
			conf.setLocation(System.getProperty("user.dir")
					+ FresnelEditorConstants.DEFAULT_REPOSITORIES_DIR
					+ File.separator + conf.getName());
		} else {
			Assert.isTrue(false, "Unhandled repository type");
		}

		// namespaces fixme igor TODO
		// conf.setNamespaces(namespaces);
		return conf;
	}

	/**
	 * Enables the 'Default' location button if local repository type is
	 * selected.
	 */
	private void repositoryTypeChanged() {
		boolean httpRadioIsSelected = httpRadio.isSelected();
		repositoryUrlTxtField.setEnabled(httpRadioIsSelected);
		repositoryUrlLabel.setEnabled(httpRadioIsSelected);
	}

	/**
	 * Enables/disables all controls on this panel based on the enabled
	 * parameter.
	 * 
	 * @param enabled
	 */
	void setEnabledIncludingChildren(boolean enabled) {
		repositoryNameTxtField.setEnabled(enabled);
		repositoryUrlTxtField.setEnabled(enabled);
		dataDomainRadio.setEnabled(enabled);
		dataDomainRadio.setForeground(FresnelEditorConstants.COLOR_DISABLED);
		frenselDomainRadio.setEnabled(enabled);
		frenselDomainRadio.setForeground(FresnelEditorConstants.COLOR_DISABLED);
		localRadio.setEnabled(enabled);
		localRadio.setForeground(FresnelEditorConstants.COLOR_DISABLED);
		httpRadio.setEnabled(enabled);
		httpRadio.setForeground(FresnelEditorConstants.COLOR_DISABLED);
	}

}